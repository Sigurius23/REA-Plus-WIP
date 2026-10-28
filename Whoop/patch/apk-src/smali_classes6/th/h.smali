.class public final Lth/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lth/a;


# instance fields
.field public final a:Lne3/p;

.field public final b:Lth/e;


# direct methods
.method public constructor <init>(JLne3/p;Lne3/e0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lth/h;->a:Lne3/p;

    new-instance v0, Lth/e;

    invoke-direct {v0, p1, p2, p3, p4}, Lth/e;-><init>(JLne3/p;Lne3/e0;)V

    iput-object v0, p0, Lth/h;->b:Lth/e;

    return-void
.end method
