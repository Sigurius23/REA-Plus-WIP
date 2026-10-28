.class public final Lxe3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[Lcf3/a;

.field public b:I

.field public c:I

.field public d:Z


# direct methods
.method public varargs constructor <init>([Lcf3/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lxe3/b;->b:I

    iput v0, p0, Lxe3/b;->c:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lxe3/b;->d:Z

    iput-object p1, p0, Lxe3/b;->a:[Lcf3/a;

    return-void
.end method
