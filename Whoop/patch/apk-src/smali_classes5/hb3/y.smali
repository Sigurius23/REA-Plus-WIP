.class public final Lhb3/y;
.super Lhb3/a0;
.source "SourceFile"


# instance fields
.field public final E:Lqa3/k;

.field public final F:Lhb3/y;

.field public final G:Lva3/c;

.field public final H:Lqa3/j;

.field public final I:Z


# direct methods
.method public constructor <init>(Lqa3/k;Lsa3/f;Lsa3/h;Lr93/s0;Lhb3/y;)V
    .locals 1

    const-string v0, "classProto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, p4}, Lhb3/a0;-><init>(Lsa3/f;Lsa3/h;Lr93/s0;)V

    iput-object p1, p0, Lhb3/y;->E:Lqa3/k;

    iput-object p5, p0, Lhb3/y;->F:Lhb3/y;

    iget p3, p1, Lqa3/k;->E:I

    invoke-static {p2, p3}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object p2

    iput-object p2, p0, Lhb3/y;->G:Lva3/c;

    sget-object p2, Lsa3/d;->f:Lsa3/c;

    iget p3, p1, Lqa3/k;->z:I

    invoke-virtual {p2, p3}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lqa3/j;

    if-nez p2, :cond_0

    sget-object p2, Lqa3/j;->x:Lqa3/j;

    :cond_0
    iput-object p2, p0, Lhb3/y;->H:Lqa3/j;

    sget-object p2, Lsa3/d;->g:Lsa3/b;

    iget p1, p1, Lqa3/k;->z:I

    invoke-virtual {p2, p1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lhb3/y;->I:Z

    sget-object p1, Lsa3/d;->h:Lsa3/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final b()Lva3/e;
    .locals 1

    iget-object v0, p0, Lhb3/y;->G:Lva3/c;

    invoke-virtual {v0}, Lva3/c;->a()Lva3/e;

    move-result-object v0

    return-object v0
.end method
