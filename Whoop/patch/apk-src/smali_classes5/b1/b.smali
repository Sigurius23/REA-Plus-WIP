.class public final Lb1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/g;


# instance fields
.field public final a:Lb1/f;

.field public final b:Ldc3/h;


# direct methods
.method public constructor <init>(Lb1/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/b;->a:Lb1/f;

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v1, v0, p1}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p1

    iput-object p1, p0, Lb1/b;->b:Ldc3/h;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-object v0, p0, Lb1/b;->b:Ldc3/h;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v0, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
