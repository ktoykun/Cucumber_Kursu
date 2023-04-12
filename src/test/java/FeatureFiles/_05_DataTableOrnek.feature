Feature: DataTable Ornek

  Scenario: Users List
    When Write username "kübra"
    And Write username and Password "kübra" and "1434"
    And Write username as DataTable
      | kübra  |
      | mehmet |
      | ayşe   |
      | kaya   |


    And Write username and password as DataTable
      | kübra  | 1434 |
      | mehmet | 2324 |
      | ayşe   | 4545 |
      | kaya   | 4554 |