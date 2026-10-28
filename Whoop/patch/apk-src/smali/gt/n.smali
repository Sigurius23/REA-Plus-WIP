.class public final Lgt/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lst/a;


# static fields
.field public static final c:Lb23/h;

.field public static final d:Lgt/f;


# instance fields
.field public a:Lb23/h;

.field public volatile b:Lst/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb23/h;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lb23/h;-><init>(I)V

    sput-object v0, Lgt/n;->c:Lb23/h;

    new-instance v0, Lgt/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lgt/f;-><init>(I)V

    sput-object v0, Lgt/n;->d:Lgt/f;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lgt/n;->b:Lst/a;

    invoke-interface {v0}, Lst/a;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
