.class public final Lb3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/r1;


# instance fields
.field public final a:Lb3/j;


# direct methods
.method public constructor <init>(Lb3/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/i;->a:Lb3/j;

    return-void
.end method


# virtual methods
.method public final a(Lb3/q1;)V
    .locals 1

    iget-object v0, p0, Lb3/i;->a:Lb3/j;

    iget-object v0, v0, Lb3/j;->a:Landroid/content/ClipboardManager;

    if-nez p1, :cond_0

    invoke-static {v0}, Lcom/squareup/wire/n;->p(Landroid/content/ClipboardManager;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lb3/q1;->a()Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    return-void
.end method
