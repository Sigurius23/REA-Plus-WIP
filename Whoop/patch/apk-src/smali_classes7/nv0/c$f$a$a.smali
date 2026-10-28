.class final Lnv0/c$f$a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnv0/c$f$a;->b(Lnv0/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.contentsearch.domain.ContentSearchInteractor$interact$1$1"
    f = "ContentSearchInteractor.kt"
    l = {
        0x15,
        0x25,
        0x28,
        0x40
    }
    m = "emit"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lnv0/c$f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnv0/c$f$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnv0/c$f$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnv0/c$f$a<",
            "-TT;>;",
            "Lq83/d<",
            "-",
            "Lnv0/c$f$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnv0/c$f$a$a;->G:Lnv0/c$f$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lnv0/c$f$a$a;->F:Ljava/lang/Object;

    iget p1, p0, Lnv0/c$f$a$a;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lnv0/c$f$a$a;->H:I

    iget-object p1, p0, Lnv0/c$f$a$a;->G:Lnv0/c$f$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lnv0/c$f$a;->b(Lnv0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
