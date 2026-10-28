.class public final Ll1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/l;


# instance fields
.field public final synthetic a:Li0/b;


# direct methods
.method public constructor <init>(Li0/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/a0;->a:Li0/b;

    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 1

    iget-object v0, p0, Ll1/a0;->a:Li0/b;

    invoke-virtual {v0, p1}, Li0/b;->a(F)F

    move-result p1

    return p1
.end method

.method public final b(FF)F
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
