.class public final Lqc/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/room/z0;

.field public final b:Lqc/b;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/l;->a:Landroidx/room/z0;

    new-instance p1, Lqc/b;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lqc/b;-><init>(I)V

    iput-object p1, p0, Lqc/l;->b:Lqc/b;

    return-void
.end method
