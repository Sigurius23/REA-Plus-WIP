.class public final Lpd3/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lkotlin/jvm/internal/g0;

.field public synthetic x:Ljava/lang/Object;

.field public y:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lpd3/c;->x:Ljava/lang/Object;

    iget p1, p0, Lpd3/c;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpd3/c;->y:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lse/a;->a0(Lno/nordicsemi/android/ble/g0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
