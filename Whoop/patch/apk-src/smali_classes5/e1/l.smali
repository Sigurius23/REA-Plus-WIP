.class public final Le1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Le1/l;


# instance fields
.field public final a:Ly2/y;

.field public final b:Ll3/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le1/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Le1/l;-><init>(Ll3/r0;Ly2/y;)V

    sput-object v0, Le1/l;->c:Le1/l;

    return-void
.end method

.method public constructor <init>(Ll3/r0;Ly2/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le1/l;->a:Ly2/y;

    iput-object p1, p0, Le1/l;->b:Ll3/r0;

    return-void
.end method

.method public static a(Le1/l;Landroidx/compose/ui/node/NodeCoordinator;Ll3/r0;I)Le1/l;
    .locals 1

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Le1/l;->a:Ly2/y;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Le1/l;->b:Ll3/r0;

    :cond_1
    new-instance p0, Le1/l;

    invoke-direct {p0, p2, p1}, Le1/l;-><init>(Ll3/r0;Ly2/y;)V

    return-object p0
.end method


# virtual methods
.method public final b()Ly2/y;
    .locals 1

    iget-object v0, p0, Le1/l;->a:Ly2/y;

    return-object v0
.end method

.method public final c(II)Li2/j;
    .locals 1

    iget-object v0, p0, Le1/l;->b:Ll3/r0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ll3/r0;->j(II)Li2/j;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final d()Z
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Le1/l;->b:Ll3/r0;

    if-eqz v1, :cond_1

    iget-object v2, v1, Ll3/r0;->a:Ll3/q0;

    iget v2, v2, Ll3/q0;->f:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll3/r0;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method public final e()Ll3/r0;
    .locals 1

    iget-object v0, p0, Le1/l;->b:Ll3/r0;

    return-object v0
.end method
