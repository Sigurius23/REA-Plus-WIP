.class public abstract Lq00/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk00/a;


# instance fields
.field public final a:Lzy/b;

.field public final b:Ljava/lang/String;

.field public final c:Z


# direct methods
.method public constructor <init>(Lzy/b;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq00/v;->a:Lzy/b;

    iput-object p2, p0, Lq00/v;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lq00/v;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq00/v;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Lzy/c;
    .locals 1

    iget-object v0, p0, Lq00/v;->a:Lzy/b;

    return-object v0
.end method

.method public final isDestructive()Z
    .locals 1

    iget-boolean v0, p0, Lq00/v;->c:Z

    return v0
.end method
