.class public abstract Li3/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li3/y;

.field public static final b:Li3/y;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li3/y;

    const/4 v1, 0x0

    sget-object v2, Li3/t;->Q:Li3/t;

    const-string v3, "TestTagsAsResourceId"

    invoke-direct {v0, v2, v3, v1}, Li3/y;-><init>(Lc93/m;Ljava/lang/String;Z)V

    sput-object v0, Li3/v;->a:Li3/y;

    sget-object v0, Li3/t;->P:Li3/t;

    new-instance v1, Li3/y;

    const/4 v2, 0x1

    const-string v3, "AccessibilityClassName"

    invoke-direct {v1, v0, v3, v2}, Li3/y;-><init>(Lc93/m;Ljava/lang/String;Z)V

    sput-object v1, Li3/v;->b:Li3/y;

    return-void
.end method
