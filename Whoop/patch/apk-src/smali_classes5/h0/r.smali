.class public final Lh0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lh0/r;

.field public static final b:Ld0/i1;

.field public static final c:Lh0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh0/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh0/r;->a:Lh0/r;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v1, v0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Lh0/r;->b:Ld0/i1;

    new-instance v0, Lh0/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh0/r;->c:Lh0/q;

    return-void
.end method
