.class public final synthetic Lo62/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;


# instance fields
.field public final synthetic a:Lo62/b;


# direct methods
.method public synthetic constructor <init>(Lo62/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo62/a;->a:Lo62/b;

    return-void
.end method


# virtual methods
.method public final onPrimaryClipChanged()V
    .locals 1

    iget-object v0, p0, Lo62/a;->a:Lo62/b;

    invoke-static {v0}, Lo62/b;->a(Lo62/b;)V

    return-void
.end method
