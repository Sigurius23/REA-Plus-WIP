.class final Lts1/a$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts1/a;->a(JLjava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.labrador.data.LabradorReadingResultDbManager"
    f = "LabradorReadingResultDbManager.kt"
    l = {
        0x57,
        0x58
    }
    m = "updateReadingSymptomsAndNotesById"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lts1/a;

.field G:I

.field w:J

.field x:J

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lts1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lts1/a;",
            "Lq83/d<",
            "-",
            "Lts1/a$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lts1/a$f;->F:Lts1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lts1/a$f;->E:Ljava/lang/Object;

    iget p1, p0, Lts1/a$f;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lts1/a$f;->G:I

    iget-object v0, p0, Lts1/a$f;->F:Lts1/a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v1, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lts1/a;->a(JLjava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
