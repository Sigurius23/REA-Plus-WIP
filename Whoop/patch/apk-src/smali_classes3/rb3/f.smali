.class public final Lrb3/f;
.super Lrb3/g;
.source "SourceFile"


# static fields
.field public static final b:Lrb3/f;

.field public static final c:Lrb3/f;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lrb3/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb3/g;-><init>(Z)V

    sput-object v0, Lrb3/f;->b:Lrb3/f;

    new-instance v0, Lrb3/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lrb3/g;-><init>(Z)V

    sput-object v0, Lrb3/f;->c:Lrb3/f;

    return-void
.end method
