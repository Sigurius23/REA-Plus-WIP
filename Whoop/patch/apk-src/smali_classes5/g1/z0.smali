.class public final Lg1/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li2/j;

.field public final b:Li2/l;

.field public final c:Li2/j;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    invoke-static {}, Luf/c0;->r()Li2/l;

    move-result-object v1

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg1/z0;->a:Li2/j;

    iput-object v1, p0, Lg1/z0;->b:Li2/l;

    iput-object v2, p0, Lg1/z0;->c:Li2/j;

    return-void
.end method
