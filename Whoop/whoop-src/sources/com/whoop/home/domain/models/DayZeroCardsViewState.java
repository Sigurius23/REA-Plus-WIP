package com.whoop.home.domain.models;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/home/domain/models/DayZeroCardsViewState;", "Lm91/u;", "", "Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;", "contents", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/whoop/home/domain/models/DayZeroCardsViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContents", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class DayZeroCardsViewState implements InterfaceC25312u {
    public static final int $stable = 8;
    private final List<CustomAnimationContainerViewState> contents;

    public DayZeroCardsViewState(List<CustomAnimationContainerViewState> contents) {
        AbstractC22676k.m65750j(contents, "contents");
        this.contents = contents;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DayZeroCardsViewState copy$default(DayZeroCardsViewState dayZeroCardsViewState, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = dayZeroCardsViewState.contents;
        }
        return dayZeroCardsViewState.copy(list);
    }

    public final List<CustomAnimationContainerViewState> component1() {
        return this.contents;
    }

    public final DayZeroCardsViewState copy(List<CustomAnimationContainerViewState> contents) {
        AbstractC22676k.m65750j(contents, "contents");
        return new DayZeroCardsViewState(contents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DayZeroCardsViewState) && AbstractC22676k.m65745e(this.contents, ((DayZeroCardsViewState) other).contents);
    }

    public final List<CustomAnimationContainerViewState> getContents() {
        return this.contents;
    }

    @Override // p720m91.InterfaceC25312u
    public /* bridge */ Object getEvent() {
        return super.getEvent();
    }

    public int hashCode() {
        return this.contents.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("DayZeroCardsViewState(contents=", ")", this.contents);
    }
}
