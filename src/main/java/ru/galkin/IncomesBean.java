package ru.galkin;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class IncomesBean {
       private  List<Income> incomes;

    public List<Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Income> incomes) {
        this.incomes = incomes;
    }
    @PostConstruct
    public void init () {
        incomes = new ArrayList<>();
        Income n1 = new Income();
        Income n2 = new Income();
        n1.setId(1);
        n1.setName("Kostya");
        n1.setValue(50000);
        n2.setId(2);
        n2.setName("Darya");
        n2.setValue(18000);
        incomes.add(n1);
        incomes.add(n2);
    }
}


