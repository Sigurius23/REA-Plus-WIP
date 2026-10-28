.class public final Ll3/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li7/g;

.field public static final b:Li7/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li7/g;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Li7/g;-><init>(I)V

    sput-object v0, Ll3/p0;->a:Li7/g;

    new-instance v0, Li7/g;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Li7/g;-><init>(I)V

    sput-object v0, Ll3/p0;->b:Li7/g;

    return-void
.end method
