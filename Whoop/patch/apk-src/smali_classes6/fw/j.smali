.class public final Lfw/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lfw/j;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfw/j;

    invoke-direct {v0}, Lfw/j;-><init>()V

    sput-object v0, Lfw/j;->b:Lfw/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lfw/j;->a:Ljava/util/List;

    return-void
.end method
