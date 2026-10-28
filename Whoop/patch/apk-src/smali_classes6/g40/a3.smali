.class public abstract Lg40/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/y2;


# instance fields
.field public final a:Lcom/stripe/android/uicore/elements/IdentifierSpec;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V
    .locals 1

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/a3;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method


# virtual methods
.method public final a()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lg40/a3;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method
