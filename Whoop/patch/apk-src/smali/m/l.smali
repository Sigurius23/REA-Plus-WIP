.class public final Lm/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li/b;


# instance fields
.field public final synthetic a:Lm/m;


# direct methods
.method public constructor <init>(Lm/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/l;->a:Lm/m;

    return-void
.end method


# virtual methods
.method public final a(Lg/l;)V
    .locals 2

    iget-object p1, p0, Lm/l;->a:Lm/m;

    invoke-virtual {p1}, Lm/m;->getDelegate()Lm/q;

    move-result-object v0

    invoke-virtual {v0}, Lm/q;->f()V

    invoke-virtual {p1}, Lg/l;->getSavedStateRegistry()Lpb/d;

    move-result-object p1

    const-string v1, "androidx:appcompat"

    invoke-virtual {p1, v1}, Lpb/d;->a(Ljava/lang/String;)Landroid/os/Bundle;

    invoke-virtual {v0}, Lm/q;->i()V

    return-void
.end method
