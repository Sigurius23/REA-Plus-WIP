.class public final La40/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La40/a;


# static fields
.field public static final w:La40/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La40/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La40/g;->w:La40/g;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    sget-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->x:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    return-void
.end method
