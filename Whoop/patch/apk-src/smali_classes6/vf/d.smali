.class public final Lvf/d;
.super Lmf/k;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:Z

.field public final c:Z

.field public final synthetic d:[B


# direct methods
.method public constructor <init>(Lmf/l;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lvf/d;->d:[B

    invoke-virtual {p1}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Lvf/d;->a:Ljava/lang/Long;

    invoke-virtual {p1}, Lmf/l;->c()Z

    move-result p2

    iput-boolean p2, p0, Lvf/d;->b:Z

    invoke-virtual {p1}, Lmf/l;->b()Z

    move-result p1

    iput-boolean p1, p0, Lvf/d;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lvf/d;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lvf/d;->c:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lvf/d;->b:Z

    return v0
.end method

.method public final d()Lyf/u;
    .locals 2

    new-instance v0, Lyf/c;

    iget-object v1, p0, Lvf/d;->d:[B

    invoke-direct {v0, v1}, Lyf/c;-><init>([B)V

    return-object v0
.end method
