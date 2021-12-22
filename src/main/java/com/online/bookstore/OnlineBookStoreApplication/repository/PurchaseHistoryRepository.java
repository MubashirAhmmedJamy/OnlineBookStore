package com.online.bookstore.OnlineBookStoreApplication.repository;

import com.online.bookstore.OnlineBookStoreApplication.model.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory,Long> {
}
