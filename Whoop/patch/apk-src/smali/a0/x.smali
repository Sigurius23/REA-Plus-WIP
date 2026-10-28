.class public abstract La0/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La0/l0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/l0;-><init>(I)V

    new-array v0, v1, [J

    sput-object v0, La0/x;->a:[J

    return-void
.end method
