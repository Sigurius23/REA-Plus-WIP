.class public final Lz0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/g;


# instance fields
.field public final a:Ldc3/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v1, v0}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v0

    iput-object v0, p0, Lz0/e;->a:Ldc3/h;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-object v0, p0, Lz0/e;->a:Ldc3/h;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v0, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
