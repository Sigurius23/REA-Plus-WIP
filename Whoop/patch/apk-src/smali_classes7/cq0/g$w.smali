.class final Lcq0/g$w;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq0/g;->l0(IIILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.community.data.repository.TeamsRepository"
    f = "TeamsRepository.kt"
    l = {
        0x165
    }
    m = "transferOwnership"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcq0/g;

.field F:I

.field w:I

.field x:I

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcq0/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq0/g;",
            "Lq83/d<",
            "-",
            "Lcq0/g$w;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcq0/g$w;->E:Lcq0/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcq0/g$w;->z:Ljava/lang/Object;

    iget p1, p0, Lcq0/g$w;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcq0/g$w;->F:I

    iget-object p1, p0, Lcq0/g$w;->E:Lcq0/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lcq0/g;->l0(IIILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
