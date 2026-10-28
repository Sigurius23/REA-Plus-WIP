.class public final synthetic Lun1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(FLp1/t2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lun1/e;->w:F

    iput-object p2, p0, Lun1/e;->x:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lun1/e;->x:Lp1/t2;

    check-cast p1, Ly3/c;

    iget v1, p0, Lun1/e;->w:F

    invoke-static {v1, v0, p1}, Lun1/g;->m(FLp1/t2;Ly3/c;)Ly3/j;

    move-result-object p1

    return-object p1
.end method
