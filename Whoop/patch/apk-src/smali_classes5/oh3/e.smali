.class public abstract Loh3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Loh3/c;

.field public static final b:Ljava/util/ArrayList;

.field public static volatile c:[Loh3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loh3/c;

    invoke-direct {v0}, Loh3/d;-><init>()V

    sput-object v0, Loh3/e;->a:Loh3/c;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Loh3/e;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    new-array v0, v0, [Loh3/d;

    sput-object v0, Loh3/e;->c:[Loh3/d;

    return-void
.end method
