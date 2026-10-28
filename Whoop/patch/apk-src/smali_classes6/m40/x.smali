.class public final Lm40/x;
.super Lm40/y;
.source "SourceFile"


# static fields
.field public static final a:Lm40/x;

.field public static final b:Lm40/x;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lm40/x;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm40/x;->a:Lm40/x;

    new-instance v0, Lm40/x;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm40/x;->b:Lm40/x;

    return-void
.end method
