package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ListDiffInterface<T> {
    boolean theSameAs(@NonNull T other);

    @Override
    boolean equals(@Nullable Object other);

}