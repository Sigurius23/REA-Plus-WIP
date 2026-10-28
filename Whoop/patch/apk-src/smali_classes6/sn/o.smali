.class public final Lsn/o;
.super Lsn/k;
.source "SourceFile"


# static fields
.field public static final E:Ljava/lang/Object;


# instance fields
.field public final y:Ljava/lang/Object;

.field public final z:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lsn/o;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lrm/o1;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lsn/k;-><init>(Lrm/o1;)V

    iput-object p2, p0, Lsn/o;->y:Ljava/lang/Object;

    iput-object p3, p0, Lsn/o;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 1

    sget-object v0, Lsn/o;->E:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsn/o;->z:Ljava/lang/Object;

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iget-object v0, p0, Lsn/k;->x:Lrm/o1;

    invoke-virtual {v0, p1}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final f(ILrm/m1;Z)Lrm/m1;
    .locals 1

    iget-object v0, p0, Lsn/k;->x:Lrm/o1;

    invoke-virtual {v0, p1, p2, p3}, Lrm/o1;->f(ILrm/m1;Z)Lrm/m1;

    iget-object p1, p2, Lrm/m1;->x:Ljava/lang/Object;

    iget-object v0, p0, Lsn/o;->z:Ljava/lang/Object;

    invoke-static {p1, v0}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    sget-object p1, Lsn/o;->E:Ljava/lang/Object;

    iput-object p1, p2, Lrm/m1;->x:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsn/k;->x:Lrm/o1;

    invoke-virtual {v0, p1}, Lrm/o1;->l(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lsn/o;->z:Ljava/lang/Object;

    invoke-static {p1, v0}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lsn/o;->E:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final m(ILrm/n1;J)Lrm/n1;
    .locals 1

    iget-object v0, p0, Lsn/k;->x:Lrm/o1;

    invoke-virtual {v0, p1, p2, p3, p4}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    iget-object p1, p2, Lrm/n1;->w:Ljava/lang/Object;

    iget-object p3, p0, Lsn/o;->y:Ljava/lang/Object;

    invoke-static {p1, p3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lrm/n1;->R:Ljava/lang/Object;

    iput-object p1, p2, Lrm/n1;->w:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method
