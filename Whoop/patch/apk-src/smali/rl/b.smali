.class public final Lrl/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrl/c;


# static fields
.field public static final w:Lrl/b;

.field public static final x:Lrl/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrl/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lrl/b;->w:Lrl/b;

    new-instance v0, Lrl/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lrl/b;->x:Lrl/a;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lql/b;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
