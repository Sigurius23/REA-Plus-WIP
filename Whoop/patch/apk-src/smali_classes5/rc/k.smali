.class public final Lrc/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lrc/k;

.field public static final b:Ljava/util/WeakHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrc/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lrc/k;->a:Lrc/k;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lrc/k;->b:Ljava/util/WeakHashMap;

    return-void
.end method
