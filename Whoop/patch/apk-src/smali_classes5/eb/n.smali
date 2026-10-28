.class public final Leb/n;
.super Landroidx/lifecycle/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lpb/f;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/lifecycle/a;-><init>(Lpb/f;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/k1;)Landroidx/lifecycle/w1;
    .locals 0

    const-string p1, "modelClass"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Leb/o;

    invoke-direct {p1, p3}, Leb/o;-><init>(Landroidx/lifecycle/k1;)V

    return-object p1
.end method
