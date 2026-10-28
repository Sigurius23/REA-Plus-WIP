.class final Ljl1/b$g;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljl1/b;->o(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.autopop.AutoPopInteractor"
    f = "AutoPopInteractor.kt"
    l = {
        0xb8
    }
    m = "loadStateFromDataStore"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Ljl1/b;

.field z:I


# direct methods
.method public constructor <init>(Ljl1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljl1/b;",
            "Lq83/d<",
            "-",
            "Ljl1/b$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljl1/b$g;->y:Ljl1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ljl1/b$g;->x:Ljava/lang/Object;

    iget p1, p0, Ljl1/b$g;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ljl1/b$g;->z:I

    iget-object p1, p0, Ljl1/b$g;->y:Ljl1/b;

    invoke-static {p1, p0}, Ljl1/b;->f(Ljl1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
