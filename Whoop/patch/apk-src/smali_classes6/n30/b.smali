.class public final Ln30/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln30/a;


# static fields
.field public static final w:Ln30/b;

.field public static final x:Ln30/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ln30/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ln30/b;->w:Ln30/b;

    new-instance v0, Ln30/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ln30/b;->x:Ln30/b;

    return-void
.end method


# virtual methods
.method public b()Ljava/util/Map;
    .locals 1

    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0
.end method
