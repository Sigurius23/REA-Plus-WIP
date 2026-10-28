.class final Ljf1/a$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljf1/a;->e(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.experiments.datastore.ExperimentsDataStoreHelper"
    f = "ExperimentsDataStoreHelper.kt"
    l = {
        0x28
    }
    m = "getVariantWithTtl"
    v = 0x2
.end annotation


# instance fields
.field E:J

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Ljf1/a;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:J


# direct methods
.method public constructor <init>(Ljf1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljf1/a;",
            "Lq83/d<",
            "-",
            "Ljf1/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljf1/a$c;->G:Ljf1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Ljf1/a$c;->F:Ljava/lang/Object;

    iget p1, p0, Ljf1/a$c;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ljf1/a$c;->H:I

    iget-object p1, p0, Ljf1/a$c;->G:Ljf1/a;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Ljf1/a;->e(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
