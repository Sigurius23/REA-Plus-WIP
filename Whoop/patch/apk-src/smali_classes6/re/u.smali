.class public final Lre/u;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/u;->b:Lre/u;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "SELECT_MFA_TYPE"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SelectMfaType"

    return-object v0
.end method
