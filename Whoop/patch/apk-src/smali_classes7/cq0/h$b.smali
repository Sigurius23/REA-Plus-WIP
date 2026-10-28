.class final Lcq0/h$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq0/h;->f(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.community.data.repository.WidgetRepository"
    f = "WidgetRepository.kt"
    l = {
        0x1c
    }
    m = "fetchWidgets"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lcq0/h;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lcq0/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq0/h;",
            "Lq83/d<",
            "-",
            "Lcq0/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcq0/h$b;->F:Lcq0/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lcq0/h$b;->E:Ljava/lang/Object;

    iget p1, p0, Lcq0/h$b;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcq0/h$b;->G:I

    iget-object v0, p0, Lcq0/h$b;->F:Lcq0/h;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcq0/h;->f(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
