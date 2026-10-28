.class public abstract Lu0/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xc

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v0

    sput-wide v0, Lu0/a1;->a:J

    const/16 v0, 0x70

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v0

    sput-wide v0, Lu0/a1;->b:J

    return-void
.end method
