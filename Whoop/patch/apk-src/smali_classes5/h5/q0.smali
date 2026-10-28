.class public final Lh5/q0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lh5/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh5/q0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lh5/q0;->w:Lh5/q0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroid/view/View;

    instance-of v0, p1, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    new-instance v0, Lh5/r0;

    invoke-direct {v0, p1}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    return-object v0

    :cond_1
    return-object v1
.end method
