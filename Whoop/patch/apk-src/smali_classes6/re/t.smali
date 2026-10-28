.class public final Lre/t;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/t;->b:Lre/t;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "SELECT_CHALLENGE"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SelectChallenge"

    return-object v0
.end method
