.class public final Lb3/s3;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ldc3/h;


# direct methods
.method public constructor <init>(Ldc3/h;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lb3/s3;->a:Ldc3/h;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onChange(ZLandroid/net/Uri;)V
    .locals 0

    iget-object p1, p0, Lb3/s3;->a:Ldc3/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p1, p2}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
