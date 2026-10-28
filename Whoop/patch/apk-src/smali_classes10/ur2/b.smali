.class public final Lur2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\n\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lur2/b;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lm/j;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Landroid/content/Context;)Lm/j;",
        "b",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lm/j;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm/i;

    invoke-direct {v0, p1}, Lm/i;-><init>(Landroid/content/Context;)V

    sget p1, Luv0/c;->H:I

    invoke-virtual {v0, p1}, Lm/i;->b(I)V

    sget p1, Luv0/c;->F:I

    invoke-virtual {v0, p1}, Lm/i;->a(I)V

    sget p1, Luv0/c;->D:I

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    invoke-virtual {p1}, Lm/i;->c()Lm/j;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/content/Context;)Lm/j;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm/i;

    invoke-direct {v0, p1}, Lm/i;-><init>(Landroid/content/Context;)V

    sget p1, Luv0/c;->H:I

    invoke-virtual {v0, p1}, Lm/i;->b(I)V

    sget p1, Luv0/c;->e:I

    invoke-virtual {v0, p1}, Lm/i;->a(I)V

    sget p1, Luv0/c;->D:I

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    invoke-virtual {p1}, Lm/i;->c()Lm/j;

    move-result-object p1

    return-object p1
.end method
