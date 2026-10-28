.class public final Lpk/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/util/LinkedHashMap;


# instance fields
.field public final a:Lpg3/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lpk/c;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lpk/c;->c:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lpg3/o;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lpg3/o;-><init>(I)V

    iput-object v0, p0, Lpk/c;->a:Lpg3/o;

    return-void
.end method
