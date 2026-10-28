.class public abstract Lny/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/stripe/android/uicore/elements/IdentifierSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "tap_to_add_form"

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    sput-object v0, Lny/f;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method
