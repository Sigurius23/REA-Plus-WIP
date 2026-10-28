.class public final Lb3/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb3/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb3/i0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb3/i0;->a:Lb3/i0;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setForceDarkAllowed(Z)V

    return-void
.end method
