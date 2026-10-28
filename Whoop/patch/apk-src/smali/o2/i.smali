.class public final Lo2/i;
.super Lo2/a0;
.source "SourceFile"


# static fields
.field public static final c:Lo2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo2/i;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lo2/a0;-><init>(I)V

    sput-object v0, Lo2/i;->c:Lo2/i;

    return-void
.end method
