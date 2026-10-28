.class public final Lio/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:[Lrm/g1;

.field public final c:[Lio/o;

.field public final d:Lrm/q1;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>([Lrm/g1;[Lio/o;Lrm/q1;Lio/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/x;->b:[Lrm/g1;

    invoke-virtual {p2}, [Lio/o;->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lio/o;

    iput-object p2, p0, Lio/x;->c:[Lio/o;

    iput-object p3, p0, Lio/x;->d:Lrm/q1;

    iput-object p4, p0, Lio/x;->e:Ljava/lang/Object;

    array-length p1, p1

    iput p1, p0, Lio/x;->a:I

    return-void
.end method


# virtual methods
.method public final a(Lio/x;I)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lio/x;->b:[Lrm/g1;

    aget-object v1, v1, p2

    iget-object v2, p1, Lio/x;->b:[Lrm/g1;

    aget-object v2, v2, p2

    invoke-static {v1, v2}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/x;->c:[Lio/o;

    aget-object v1, v1, p2

    iget-object p1, p1, Lio/x;->c:[Lio/o;

    aget-object p1, p1, p2

    invoke-static {v1, p1}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final b(I)Z
    .locals 1

    iget-object v0, p0, Lio/x;->b:[Lrm/g1;

    aget-object p1, v0, p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
