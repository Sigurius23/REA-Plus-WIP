.class public final Lre/j;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/j;->b:Lre/j;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "CUSTOM_CHALLENGE"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "CustomChallenge"

    return-object v0
.end method
