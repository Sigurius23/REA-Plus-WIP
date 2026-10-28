.class public final Lm6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm6/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lm6/a;->a:Lm6/a;

    return-void
.end method
